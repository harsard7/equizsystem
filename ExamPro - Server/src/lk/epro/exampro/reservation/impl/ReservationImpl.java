/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.reservation.impl;

import java.util.HashMap;
import java.util.Map;
import lk.ijse.exampro.service.SuperService;

/**
 *
 * @author Hafees
 */
public class ReservationImpl<T extends SuperService> {
    
    //like page of reservation Book
    private static class ResPage<T>{//inner class
        
        private T service;
        private boolean internally;

        public ResPage(T service, boolean internally) {
            this.service = service;
            this.internally = internally;
        }

        /**
         * @return the service
         */
        public T getService() {
            return service;
        }

        /**
         * @param service the service to set
         */
        public void setService(T service) {
            this.service = service;
        }

        /**
         * @return the internally
         */
        public boolean isInternally() {
            return internally;
        }

        /**
         * @param internally the internally to set
         */
        public void setInternally(boolean internally) {
            this.internally = internally;
        }
        
        
    }
    
    private Map<Object, ResPage<T>> resBook = new HashMap<>();
    
    public boolean reserve(Object key, T service, boolean internally){
        if (resBook.containsKey(key)){
            System.out.println("  11 else reserve ");
            if (resBook.get(key).service == service){
                System.out.println("  22 else reserve ");
                return true;
            }else{
                System.out.println("  33 else reserve ");
                return false;
            }
        }else{
            System.out.println(" 44  else reserve ");
            resBook.put(key, new ResPage<>(service, internally));
            return true;
        }
    }
    
    public boolean isReservedInternally(Object key){
         System.out.println("111 isReservedInternally  ");
        if (resBook.containsKey(key)){
             System.out.println("222 isReservedInternally  ");
            return (resBook.get(key).internally);
            
        }else{
            System.out.println("3333 isReservedInternally  ");
            return false;
        }
    }
    
    public boolean release(Object key){
        if (resBook.containsKey(key)){
            resBook.remove(key);
            return true;
        }else{
            return false;
        }
    }
    
}
