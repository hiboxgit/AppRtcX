package com.lachesis.anroid.apprtcx.share;

import com.lachesis.common.utils.SPUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  运行状态机类
 *
 * （用于管理全局运行状态变量）
 *
 * Created by Robert on 2017/9/20.
 */

public class RunDataHelper {
    private Logger logger = LoggerFactory.getLogger(AppConfig.TAG);
    private static RunDataHelper instance = new RunDataHelper();

    /* *
     *
     * 运行状态通用变量
     *
     */

    private SPUtils spAgent;

    private RunDataHelper(){

    }

    public static RunDataHelper getInstance(){

        return instance;
    }

    //初始化状态机参数
    public void init(){

        if(spAgent == null){
            spAgent = new SPUtils(AppConfig.TAG);
        }

        initParam();
    }

    private void initParam(){

    }

    public SPUtils getSpAgent() {
        return spAgent;
    }

    public void setSpAgent(SPUtils spAgent) {
        this.spAgent = spAgent;
    }
}
