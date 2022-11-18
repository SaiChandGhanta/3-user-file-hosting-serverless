package edu.neu.csye6225.serverless;

import com.sendgrid.SendGrid;

public class SGConfig {

    String appkey="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";

    public SendGrid getSendGrid(){
        return new SendGrid(appkey);
    }


}
