/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms;

/**
 *
 * @author pavan
 */
public class sending {
    public static void main(String args[])
    {
        String a="+918008006913";
        String h="hai";
    SMSClient smsc = new SMSClient(-1);
    smsc.sendMessage(a, h);
            }                                   
}
