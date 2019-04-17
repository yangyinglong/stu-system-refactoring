package cn.hdu.fragmentTax.controller;


import cn.hdu.fragmentTax.utils.PropertiesUtil;
import org.apache.commons.io.FileUtils;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Component
@Path("/file")
@CrossOrigin
public class FileController {
    private static final String IMAGE_PATH = PropertiesUtil.prop("img_path");

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Path("/upload")
    public void upload(@FormDataParam("file") InputStream fileInputStream,
                       @FormDataParam("file") FormDataContentDisposition fileDisposition,
                       @FormDataParam("fileName") String fileName,
                       @FormDataParam("isFront") String isFront) throws IOException {

        fileName = fileName + "—" + isFront + ".jpg";

        //使用common io的文件写入操作
        FileUtils.copyInputStreamToFile(fileInputStream, new File(IMAGE_PATH + fileName));
    }
}
