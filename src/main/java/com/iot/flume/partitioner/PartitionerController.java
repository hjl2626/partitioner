package com.iot.flume.partitioner;

import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

public class PartitionerController implements Partitioner {

    /**
     * 必须要有这个构造函数
     * @param vp
     */
    public PartitionerController(VerifiableProperties vp) {

    }

    /* (non-Javadoc)
     * @see kafka.producer.Partitioner#partition(java.lang.Object, int)
     */
    public int partition(Object parKey, int partition) {
        /*
         * 在这里您可以根据自身的业务过程重新运算一个分区，并进行返回。
         */
        Integer parKeyValue = Integer.valueOf((String)parKey);
        return parKeyValue;
    }
}