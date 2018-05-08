package com.faw.poc.iotclientmock.DirectlyConnectedMock;

import com.alibaba.fastjson.JSON;
import com.faw.poc.iotclientmock.model.IotMsg;
import oracle.iot.client.StorageObject;
import oracle.iot.client.device.VirtualDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("MockMischiDeviceMock")
public class MockMischiDeviceMock extends MockAbsService{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${iot.client.remote_host_name}")
    private String remote_host_name;

    public void startWork(String activation_ID,String file_Protection_Password,String URN,String content) {
        IotMsg iotMsg=convertIotMsg(content);
        try {
            if(iotMsg!=null) {
               logger.debug(remote_host_name+"|"+URN+"|"+activation_ID);
                this.handleWork(remote_host_name, iotMsg, URN, activation_ID, file_Protection_Password);
            } else{
                logger.info("Error input");
            }
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        logger.debug("message sent ["+iotMsg.toString()+"]");
    }

    private IotMsg convertIotMsg(String content) {
        return JSON.parseObject(content,IotMsg.class);
    }

    @Override
    public void sendMessage(VirtualDevice virtualDevice, IotMsg iotMsg) {
        virtualDevice.update()
                .set("UUID",iotMsg.getUuid())
                .set("TEMP", iotMsg.getTemp())
                .set("ACCE_X", iotMsg.getAcce_x())
                .set("ACCE_Y", iotMsg.getAcce_y())
                .set("ACCE_Z", iotMsg.getAcce_z())
                .set("RMS_X", iotMsg.getRms_x())
                .set("RMS_Y", iotMsg.getRms_y())
                .set("RMS_Z", iotMsg.getRms_z())
                .set("MOTION_X", iotMsg.getMotion_x())
                .set("MOTION_Y", iotMsg.getMotion_y())
                .set("MOTION_Z", iotMsg.getMotion_z())
                .set("CREATETIME", new Date())
                .finish();
    }
}
