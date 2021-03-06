package com.hero.hotel.utils;


/**  
 *Project Name: QDLIMAP  
 *File Name:    WebuploaderUtil.java  
 *Package Name: com.ltmap.platform.cms.util  
 *Date:         2017年4月13日 下午6:30:45  
 *Copyright (c) 2017,578888218@qq.com All Rights Reserved.  
*/  
   
  
import java.io.File;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.web.multipart.MultipartFile;  
  
/**  
 *Title:      WebuploaderUtil<br/>  
 *Description:  
 *@Company:   励图高科<br/>  
 *@author:    刘云生  
 *@version:   v1.0  
 *@since:     JDK 1.8.0_40  
 *@Date:      2017年4月13日 下午6:30:45 <br/>  
*/  
public class WebuploaderUtil {  
    private String allowSuffix = "jpg,png,gif,jpeg";//允许文件格式  
    private long allowSize = 2L;//允许文件大小  
    private String fileName;  
    private String[] fileNames;  
      
    public String getAllowSuffix() {  
        return allowSuffix;  
    }  
  
    public void setAllowSuffix(String allowSuffix) {  
        this.allowSuffix = allowSuffix;  
    }  
  
    public long getAllowSize() {  
        return allowSize*1024*1024;  
    }  
  
    public void setAllowSize(long allowSize) {  
        this.allowSize = allowSize;  
    }  
  
    public String getFileName() {  
        return fileName;  
    }  
  
    public void setFileName(String fileName) {  
        this.fileName = fileName;  
    }  
  
    public String[] getFileNames() {  
        return fileNames;  
    }  
  
    public void setFileNames(String[] fileNames) {  
        this.fileNames = fileNames;  
    }  
  
      
  
    /**  
     *   
     * @Title:       getFileNameNew    
     * @Description: TODO    
     * @param:       @return  
     * @return:      String  
     * @author:      刘云生  
     * @Date:        2017年4月14日 上午10:17:35     
     * @throws  
     */  
    private String getFileNameNew(){  
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");  
        return fmt.format(new Date());  
    }  
      
  
    /**  
     *   
     * @Title:       uploads    
     * @Description: TODO    
     * @param:       @param files  
     * @param:       @param destDir  
     * @param:       @param request  
     * @param:       @throws Exception  
     * @return:      void  
     * @author:      刘云生  
     * @Date:        2017年4月14日 上午10:17:14     
     * @throws  
     */  
    public void uploads(MultipartFile[] files, String destDir,HttpServletRequest request) throws Exception {  
        String path = request.getContextPath();  
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
        try {  
            fileNames = new String[files.length];  
            int index = 0;  
            for (MultipartFile file : files) {  
                String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);  
                int length = getAllowSuffix().indexOf(suffix);  
                if(length == -1){  
                    throw new Exception("请上传允许格式的文件");  
                }  
                if(file.getSize() > getAllowSize()){  
                    throw new Exception("您上传的文件大小已经超出范围");  
                }  
                String realPath = request.getSession().getServletContext().getRealPath("/");  
                File destFile = new File(realPath+destDir);  
                if(!destFile.exists()){  
                    destFile.mkdirs();  
                }  
                String fileNameNew = getFileNameNew()+"."+suffix;//  
                File f = new File(destFile.getAbsoluteFile()+"\\"+fileNameNew);  
                file.transferTo(f);  
                f.createNewFile();  
                fileNames[index++] =basePath+destDir+fileNameNew;  
            }  
        } catch (Exception e) {  
            throw e;  
        }  
    }  
      
  
    /**  
     *   
     * @Title:       upload    
     * @Description: TODO    
     * @param:       @param file  
     * @param:       @param destDir  
     * @param:       @param request  
     * @param:       @throws Exception  
     * @return:      void  
     * @author:      刘云生  
     * @Date:        2017年4月14日 上午10:16:16     
     * @throws  
     */  
    public void upload(MultipartFile file, String destDir,HttpServletRequest request) throws Exception {  
        String path = request.getContextPath();  
        //http://localhost:8088/huahang
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
        try {  
                String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);  
                int length = getAllowSuffix().indexOf(suffix);  
                if(length == -1){  
                    throw new Exception("请上传允许格式的文件");  
                }  
                if(file.getSize() > getAllowSize()){  
                    throw new Exception("您上传的文件大小已经超出范围");  
                }  
                  
                String realPath = request.getSession().getServletContext().getRealPath("/")+"/";  
                
                File destFile = new File(realPath+destDir);  
                if(!destFile.exists()){  
                    destFile.mkdirs();  
                }  
                String fileNameNew = getFileNameNew()+"."+suffix;  
                File f = new File(destFile.getAbsoluteFile()+"/"+fileNameNew);  
                file.transferTo(f);  
                f.createNewFile();  
                //包含网站的全路径http://localhost:8080/QDLIMAP/upload/user/20170414104142667.png  
                //fileName = basePath+destDir+fileNameNew;  
                //返回相对路径upload/user/20170414104142667.png  
                fileName = destDir+fileNameNew;  
        } catch (Exception e) {  
            throw e;  
    }  
}  
}
