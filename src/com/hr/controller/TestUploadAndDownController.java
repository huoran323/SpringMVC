package com.hr.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TestUploadAndDownController {

	/**
	 * 文件下载
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/down")
	public ResponseEntity<byte[]> down(HttpSession session) throws IOException{
		
		//获取下载文件的路径:获取项目中img文件的路径
		String realPath = session.getServletContext().getRealPath("img");
		String finalPath = realPath + File.separator + "1.jpg";
		InputStream is = new FileInputStream(finalPath);
		
		//available()：获取输入流所读取的文件的最大字节数，即获取1.jpg文件的字节数
		byte[] b = new byte[is.available()];
		is.read(b);
		
		//设置请求头
		HttpHeaders headers = new HttpHeaders();
		//attachment:以附件的形式下载；filename：为所下载的文件设置默认的名字
		headers.add("Content-Disposition", "attachment;filename=abc.jpg");
		
		//设置响应状态
		HttpStatus statusCode = HttpStatus.OK;
		 
		ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(b, headers, statusCode);
		
		is.close();
		return entity;
	}
	
	/**
	 * 文件上传
	 * @param desc
	 * @param uploadFile
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/up", method=RequestMethod.POST)
	public String up(String desc, MultipartFile uploadFile, HttpSession session) throws IOException {
		//获取上传文件的名称
		String filename = uploadFile.getOriginalFilename();
		//filename.substring(filename.lastIndexOf(".")) 截取出来的是后缀名，如.jpg .txt;添加UUID防止文件重名
		String finalFileName = UUID.randomUUID() + filename.substring(filename.lastIndexOf("."));
		String path = session.getServletContext().getRealPath("photo") + File.separator + finalFileName;
		
		File file = new File(path);
		uploadFile.transferTo(file);
		return "success";
	}
	
	/**
	 * 文件上传
	 * @param desc
	 * @param uploadFile
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/up_old", method=RequestMethod.POST)
	public String up_old(String desc, MultipartFile uploadFile, HttpSession session) throws IOException {
		//获取上传文件的名称
		String filename = uploadFile.getOriginalFilename();
		String path = session.getServletContext().getRealPath("photo") + File.separator + filename;
		//获取输入流
		InputStream is = uploadFile.getInputStream();
		//获取输出流
		File file = new File(path);
		OutputStream os = new FileOutputStream(file);
		
		int i = 0;
		byte[] b = new byte[1024];
		while((i = is.read(b)) != -1) {
			os.write(b,0,i);
		}
		os.close();
		is.close();
		return "success";
	}
}
