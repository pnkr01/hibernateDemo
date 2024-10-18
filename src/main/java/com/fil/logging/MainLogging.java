//package com.fil.logging;
//
//import org.apache.log4j.Logger;
//
//public class MainLogging {
//
//   private static Logger logger = Logger.getRootLogger();
//    public static void main(String[] args) {
//        logger.debug("main started");
//        logger.trace("trace started");
//        logger.info("main started");
//        logger.warn("main started");
//        logger.error("main started");
//        logger.fatal("main started");
//        int [] a = {1,222,3,40,5,6,7,18,9,10};
//        bubbleSort(a);
//    }
//
//    private static void bubbleSort(int[] a) {
//        logger.debug("bubble sort started...");
//        if(a.length > 1) {
//            try{
//                for(int i = 1; i < a.length; i++) {
//                    logger.trace("a[i]"+a[i]);
//                    for(int j = 0; j < i; j++) {
//                        if(a[j] > a[j+1]) {
//                            int temp = a[j];
//                            a[j] = a[j+1];
//                            a[j+1] = temp;
//                        }
//                    }
//                }
//            }catch(Exception e) {
//                e.printStackTrace();
//                logger.error(e);
//            }
//            logger.debug("bubble sort finished");
//        }else{
//            logger.warn("bubble sort failed as the length of array is less than 1");
//        }
//    }
//}
