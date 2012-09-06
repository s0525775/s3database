/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author s0525775
 */
public class AWSUser {
    
	String userName;
	String displayName;
	String eMail;
	String password;
	String confirmPassword;
        String awsKeyId;
        String awsSecretKey;
        
	public String getUserName() {
		return userName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public String getEMail() {
		return eMail;
	}
	public String getAWSKeyId() {
		return awsKeyId;
	}
	public String getAWSSecretKey() {
		return awsSecretKey;
	}

}
