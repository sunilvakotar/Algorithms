//package com.sunil.practice;
//
//import org.apache.commons.codec.DecoderException;
//import org.apache.commons.codec.binary.Base64;
//import org.apache.commons.codec.binary.Hex;
//
//public class HexToBase64 {
//
//    public static void main(String[] args) {
////        String hex  = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
//        String hex = "0A0501010000000057007B000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010C00010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029 E000818 D0029 E001830 D0029 E003C60 D0029 E001E AE0 D0029 E001E AE0 D0029 E001C AE0 D0029 D000799 AE0 D0029 D001F A 9 AE0 D0029 D0039 A 1 AE0 D0029 D0038 A 9 AE0 D0029 D00387D AE0 D0029 C0001989DAE0 D0029 D00811D AE0 D0029 D00820D AE0 D0029 D008405 AC0 D0029 D00BF AFD90 D0029 D00BF A 92060 C0029 D00BF A 261 A 0 C0029 D008F AC0 A T A 0 C0029 D00 AC000 A X60 C0029 C00027F AFF AFB AC0 C0029 C00037F AFF A 380 C0029 C00033F AFF AE0 D0029 C00030001 AEC D0029 C0003 B11 AEE D0029 C00033B99 AEE D0029 C00037F ADD A W D0029 C000339 ADD A S D0029 C0003198D A S D0029 C00018005 A B D0029 C0001 AC005 AF D0029 C0001 AFF A 986 D0029 D00 AFF A 10E D0029 D007F A S1E D0029 D001F ADF AFC D0029 E001F A 8 D0029 E000F A 0 D0029 D000207 AC0 D002901 AFF B0007 F002901 AFF800007 B0002 C002901 AE0 AC00002 B0006 C002901 AE01C A T8E399E1F8F0F002901 AE01F A 7 A G3F AFF3F ADF9F802901 AFC1F AFF A X3F A T9E39 ADC802901 AFF1E79 A X3C039E39 AFC002901 AE01E79 A X3C079E7B9F002901 AE01E79 A X3C1F9E7F0F802901 AE01E79 AX3C3B9E7E07 AC02901 AE01E79 A X3C739E7803 AC02901 AE01E79 A X3C739E7801 AC02900 AE05E79 A X3C738E3861 AC02900 AFF ADE38 A X3C7F8E1F AFF802900 AFF ACE38 A 79C3F ACF0F9F0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029CB0029";
//        byte[] decodedHex = new byte[0];
//        try {
//            decodedHex = Hex.decodeHex(hex.toCharArray());
//        } catch (DecoderException e) {
//            e.printStackTrace();
//        }
//        String result = Base64.encodeBase64String(decodedHex);
//        System.out.println("==> " + result);
//    }
//
//}