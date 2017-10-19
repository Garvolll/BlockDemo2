package org.cityu.cs.ian.model;

import org.cityu.cs.ian.model.bean.BlockBean;

import java.io.File;
import java.util.List;

public interface IBlockModel {
    /**
     * 把区块存成文件保存到本地
     * @param blockJson
     */
    boolean saveBlockToLocal(String blockJson);

    /**
     * 从配置文件中读取区块存储的文件夹路径
     * @return
     */
   String getBlockPath();

    /**
     * 获取新区块文件名称  暂定使用区块高度命名
     * @return
     */
   String getCurrentBlockName();


   long getTopBlockHeight();
    /**
     * 获取当前链的最后一个区块的hash
     * @return
     */
   String getTopBlockHash();

    /**
     * 获取当前链的高度
     *
     * @return
     */
    long getTotalBlockCount();

    /**
     * 获取所有区块文件
     * @return
     */
    List<File> getAllBolckFiles();

    /**
     * 获取所有区块对象集合
     * @return
     */
    List<BlockBean> getAllBlockBeans();

}
