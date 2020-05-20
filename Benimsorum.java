/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benimsorum;

/**
 *
 * @author Lenovo
 */


import java.util.Scanner;
//import java.io.*;
//public class yazarid
public class Benimsorum
{
public int isim;
public int soyisim;
public int dyıl;
private int Toplam;
public int ebob;

    /**
     *
     * @param args
     */
    public void main (String[] args){
Scanner deger=new Scanner(System.in);
    System.out.print("Yazar İsmini Giriniz:");
    String ad=deger.nextLine();
    this.isim=ad.length();
            
    
    System.out.println("Yazar Soyadını Giriniz:");
     String soyad=deger.nextLine();
    this.soyisim=soyad.length();
    
            
    System.out.println("Yazarın Doğum yılı");
    this.dyıl=deger.nextInt();        
    
    
    System.out.println("Yazar Kodu:"+Toplam+"-"+ ebob);
    
}
public int Toplam(int isim,int soyisim){
int t= isim +soyisim;
return t;}
public int Toplam(int isim,int soyisim,int dyıl){
int t=isim+soyisim+dyıl;
return t;}
public int ebob (int isim,int soyisim){
    for(int i = 1; i <= isim && i <= soyisim; ++i)
        {
            if(isim % i==0 && soyisim % i==0)
                this.ebob = i;
            
        }
    return ebob;
}

     public int ebob (int isim,int soyisim,int dyıl){
    for(int i = 1; i <= isim && i <= soyisim && i <= dyıl; ++i)
   
        {
            if(isim % i==0 && soyisim % i==0 && dyıl % i==0)
                this.ebob = i;
            
        }
        return ebob;
}}
     class kitapid extends /*yazarid*/ Benimsorum {
        int basımyılı= 2004;
        int c= dyıl;
        int kitid =  basımyılı + dyıl;
       
     }
     
 