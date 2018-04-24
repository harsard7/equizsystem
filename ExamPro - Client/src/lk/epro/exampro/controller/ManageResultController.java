/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.controller;

import java.util.List;
import lk.ijse.exampro.dto.ResultDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.proxy.ProxyHandler;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.custom.ResultService;

/**
 *
 * @author Hafees
 */
public class ManageResultController {
    
    public static boolean addResult(ResultDTO Result) throws Exception{
        ResultService ResultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return ResultService.addResult(Result);
    }
    
    public static boolean updateResult(ResultDTO Result) throws Exception{
        ResultService ResultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return ResultService.updateResult(Result);
    }

    public static boolean deleteResult(String ResultId) throws Exception{
        ResultService ResultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return ResultService.deleteResult(ResultId);
    }    
    
    public static List<ResultDTO> getAllResults() throws Exception{
        ResultService ResultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return ResultService.getAllResult();
    }
    
    public static void registerObserver(Observer observer) throws Exception{
        Subject ResultService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        ResultService.registerObserver(observer);
    }
    
    public static void unregisterObserver(Observer observer) throws Exception{
        Subject ResultService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        ResultService.unregisterObserver(observer);
    }
    
    public static boolean reserveResult(String ResultId) throws Exception{
        ResultService ResultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return ResultService.reserve(ResultId);
    }
    
    public static boolean releaseResult(String ResultId) throws Exception{
        ResultService ResultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return ResultService.release(ResultId);        
    }
    
}

