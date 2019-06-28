package com.hero.hotel.controller;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("/picture")
public class PictureUploadController {
	
/*	public ActionResult UploadPic(long houseId, HttpPostedFileBase file){
        String cacleFileName = CacleMD5.CalcMD5(file.InputStream);
        String ext = Path.GetExtension(file.FileName);
        String path = "/upload/" + DateTime.Now.ToString("yyyy/MM/dd") + "/" + cacleFileName + ext;
        String fullPath = HttpContext.Server.MapPath("~" + path);//拿到服务器上的绝对路径。
        new FileInfo(fullPath).Directory.Create();//尝试创建可能不存在的文件夹



        file.InputStream.Position = 0;//指针复位
        file.SaveAs(fullPath);
        houseSer.AddNewHousePic(new HousePicDTO { HouseId = houseId, Url = path, ThumbUrl = path });
        //将文件保存，保存到该系统的根目录下，以HouseId为文件名。
        //file.SaveAs(HttpContext.Server.MapPath("~/" + houseId + Path.GetExtension(file.FileName)));
        // return Content("ok");
        return Json(new AjaxResult { Status = "Ok" });
    }*/
	/*@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/upload")
	public void addFile(HttpServletRequest request,
			HttpServletResponse response)
			throws IllegalStateException, IOException {
		String uid=request.getParameter("uid");//获取uid
		String pid=request.getParameter("pid");//获取jsp id参数
		System.out.println(uid);
		System.out.println(pid);
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// int pre = (int) System.currentTimeMillis();//开始时时间
				MultipartFile file = multiRequest.getFile(iter.next());
				if (file != null) {
					String myFileName = file.getOriginalFilename();
					if (myFileName.trim() != "") {
						String fileName = file.getOriginalFilename();
						String fileExt = fileName.substring(
								fileName.lastIndexOf(".") + 1).toLowerCase();
						SimpleDateFormat df = new SimpleDateFormat(
								"yyyyMMddHHmmss");
						String newFileName = df.format(new Date());
						String fileNames = newFileName
								+ new Random().nextInt(1000) + "." + fileExt;
						 String path = "d:/" + fileNames;//上传路径
						// String path =
						// request.getSession().getServletContext()
						// .getRealPath("/resources/contractImgs")
						// + "/" + fileNames;
						File localFile = new File(path);
						if (!localFile.exists()) {// 如果文件夹不存在，自动创建
							localFile.mkdirs();
						}
						file.transferTo(localFile);
					}
				}
			}
			
		}
	}*/
}

/*import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.wdg.util.BuildJsonOfObject;

@RestController
@RequestMapping("/filecontroller")
public class PictureUploadController {

	private Logger log;

	public PictureUploadController() {
		this.log = Logger.getLogger(this.getClass());
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file")MultipartFile files,HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject json=new JSONObject();
		response.setCharacterEncoding("utf-8");
		String msg = "添加成功";
		log.info("-------------------开始调用上传文件upload接口-------------------");
		try{
		String name = files.getOriginalFilename();
		String path = this.getClass().getClassLoader().getResource("/").getPath();
		int index = path.indexOf("Shopping");
		path = path.substring(0, index + "Shopping".length()) + "/WebContent/resources/upload/";
		path = path + File.separator + name;
		File uploadFile = new File(path);
		files.transferTo(uploadFile);
		}catch(Exception e){
			msg="添加失败";
		}
		log.info("-------------------结束调用上传文件upload接口-------------------");
		json.put("msg", msg);
		return BuildJsonOfObject.buildJsonOfJsonObject(json);
	}

	private byte[] inputStreamToByte(InputStream is) throws IOException {
		ByteArrayOutputStream bAOutputStream = new ByteArrayOutputStream();
		int ch;
		while ((ch = is.read()) != -1) {
			bAOutputStream.write(ch);
		}
		byte data[] = bAOutputStream.toByteArray();
		bAOutputStream.close();
		return data;
	}

	@RequestMapping(value = "/uploadservlet", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	protected String uploadServlet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject json=new JSONObject();
		response.setCharacterEncoding("utf-8");
		String msg = "添加成功";
		log.info("-------------------开始调用上传文件uploadservlet接口-------------------");
		try {
			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
				List<MultipartFile> multipartFile = mr.getFiles("myfile");
				if (null != multipartFile && !multipartFile.isEmpty()) {
					MultipartFile file = multipartFile.get(0);
					String name = file.getOriginalFilename();
					String path = this.getClass().getClassLoader().getResource("/").getPath();
					int index = path.indexOf("Shopping");
					path = path.substring(0, index + "Shopping".length()) + "/WebContent/resources/upload/";
					path = path + File.separator + name;
					File uploadFile = new File(path);
					if(FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(uploadFile))>0)
					{
						json.put("path",path);
					}
				
				}
			}
		} catch (Exception e) {
			msg = "上传失败";
		}
		log.info("-------------------结束调用上传文件uploadservlet接口-------------------");
		json.put("msg", msg);
		return BuildJsonOfObject.buildJsonOfJsonObject(json);
	}
}*/