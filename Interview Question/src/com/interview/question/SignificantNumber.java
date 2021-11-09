package com.interview.question;

import java.util.*;
public class SignificantNumber {

 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first number ");
  int N=sc.nextInt();
  System.out.println("Enter the second number");
  int K=sc.nextInt();
  System.out.println("Significant number is "+Significant(N,K));
  

 }
 static int Significant(int n,int k) {
  ArrayList<Integer> result=new ArrayList<Integer>();
  if(isReversible(n)) {
   return 1;
  }
  else {
   ArrayList<Integer> arr=modify(n);
   for(int i=0;i<arr.size();i++) {
    int h=childPrimeSum(arr.get(i));
    result.add(h);
   }
   int fr=countPair(result, k);
   return fr;
  }
 }
 
 static int childPrimeSum(int num) {

  int sum=0,temp=2;
  boolean flag=true;
  while(flag) {
   
   int sum2=(2*temp)+1;
   if(sum2 >= num) {
    break;
   }
   sum+=sum2;
   temp=nextPrime(temp);
  }
  return sum;
 }
 
 
 static ArrayList<Integer> modify(int num){
  String s=String.valueOf(num);
  ArrayList<Integer> arr =new ArrayList<Integer>();
  for(int i=0;i<s.length();i++) {
   char c=s.charAt(i);
   int n=Character.getNumericValue(c);
   n=n*5;
   arr.add(n);
  }
  return arr;
  
 }
 static boolean isReversible(int num) {
  String s=String.valueOf(num);
  StringBuffer sb=new StringBuffer(s);
  sb.reverse();
  String s2=new String(sb);
  if(s.equals(s2)) {
   return true;
  }
  else {
   return false;
  }
 }
 
 static int nextPrime(int n) {
  int ctr=0;
  for(int j=n+1;true;j++) {
   ctr=0;
   for(int i=1;i<=j/2;i++) {
    if(j%i == 0) {
     ctr++;
    }
   }
   if(ctr == 1) {
    return j;
   }
  }
 }
 
 static int countPair(ArrayList<Integer> arr,int k) {
  int sum=0;
  int ctr=0;
  for(int i=0;i<arr.size();i++) {
   for(int j=i+1;j<arr.size();j++) {
    sum=arr.get(i)+arr.get(j);
    
    if(sum % k ==0) {
  
     ctr++;
    }
   }
  }
  return ctr;
 }
}