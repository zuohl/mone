package com.xiaomi.youpin.codecheck.code.impl.youpin;

import com.sun.source.tree.CompilationUnitTree;
import com.xiaomi.youpin.codecheck.CommonUtils;
import com.xiaomi.youpin.codecheck.code.impl.CompilationCheck;
import com.xiaomi.youpin.codecheck.po.CheckResult;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @Author zhangping17
 * @Date 2022/1/16 19:30
 */
public class IPRule extends CompilationCheck {
    private static final String DESC = "file should avoid IP addresses";
    private static final String CHINA_DESC = "文件内容应该避免包含ip地址";

    @Override
    public Pair<Integer, CheckResult> _check(CompilationUnitTree compilationUnitTree) {
        if (CommonUtils.hasIPv4(compilationUnitTree.toString())){
            return Pair.of(CheckResult.ERROR, CheckResult.getErrorRes("IPRule", DESC, CHINA_DESC));
        } else {
            return Pair.of(CheckResult.INFO, CheckResult.getInfoRes("IPRule", "", ""));
        }
    }
}