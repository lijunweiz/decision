package cn.unminded.rtool.engine;

import cn.unminded.rtool.engine.aviator.AviatorEngine;

/**
 * 规则表达式执行引擎
 */
public final class ExecutionEngine {

    public static Engine getDefaultEngine() {
        return ExecutionEngineHolder.AVIATOR_ENGINE;
    }

    public static Engine getAviatorEngine() {
        return ExecutionEngineHolder.AVIATOR_ENGINE;
    }

    private static class ExecutionEngineHolder {
        private static final AviatorEngine AVIATOR_ENGINE = new AviatorEngine();
    }


}
