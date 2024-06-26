package jmg.core.config;

import java.util.HashMap;
import java.util.Map;

public class AbstractConfig {


    private String injectorClassName;

    public String getInjectorClassName() {
        return injectorClassName;
    }

    public void setInjectorClassName(String injectorClassName) {
        this.injectorClassName = injectorClassName;
    }


    private boolean implementsASTTransformationType = false;

    private boolean implementsScriptEngineFactory = false;

    public void setImplementsASTTransformationType(boolean implementsASTTransformationType) {
        this.implementsASTTransformationType = implementsASTTransformationType;
    }

    public void setImplementsScriptEngineFactory(boolean implementsScriptEngineFactory) {
        this.implementsScriptEngineFactory = implementsScriptEngineFactory;
    }

    public boolean isImplementsASTTransformationType() {
        return implementsASTTransformationType;
    }

    public boolean isImplementsScriptEngineFactory() {
        return implementsScriptEngineFactory;
    }


    private String injectorSimpleClassName;

    public String getInjectorSimpleClassName() {
        return injectorSimpleClassName;
    }

    public void setInjectorSimpleClassName(String injectorSimpleClassName) {
        this.injectorSimpleClassName = injectorSimpleClassName;
    }


    private byte[] injectorBytes;

    public byte[] getInjectorBytes() {
        return injectorBytes;
    }

    public void setInjectorBytes(byte[] injectorBytes) {
        this.injectorBytes = injectorBytes;
    }


    private int injectorBytesLength;

    public int getInjectorBytesLength() {
        return injectorBytesLength;
    }

    public void setInjectorBytesLength(int injectorBytesLength) {
        this.injectorBytesLength = injectorBytesLength;
    }



    private String shellClassName;

    public String getShellClassName() {
        return shellClassName;
    }

    public void setShellClassName(String className) {
        this.shellClassName = className;
    }



    private String shellSimpleClassName;

    public String getShellSimpleClassName() {
        return shellSimpleClassName;
    }

    public void setShellSimpleClassName(String shellSimpleClassName) {
        this.shellSimpleClassName = shellSimpleClassName;
    }

    private byte[] shellBytes;

    public byte[] getShellBytes() {
        return shellBytes;
    }

    public void setShellBytes(byte[] shellBytes) {
        this.shellBytes = shellBytes;
    }


    private int shellBytesLength;



    public int getShellBytesLength() {
        return shellBytesLength;
    }

    public void setShellBytesLength(int shellBytesLength) {
        this.shellBytesLength = shellBytesLength;
    }


    public String getShellGzipBase64String() {
        return shellGzipBase64String;
    }

    public void setShellGzipBase64String(String shellGzipBase64String) {
        this.shellGzipBase64String = shellGzipBase64String;
    }

    public String shellGzipBase64String;


    public boolean isEnableDebug() {
        return enableDebug;
    }

    public void setEnableDebug(boolean enableDebug) {
        this.enableDebug = enableDebug;
    }

    private boolean enableDebug = false;




    private String urlPattern;

    private String outputFormat;
    private String savePath;
    private String pass;
    private String key;
    private String serverType;
    private String shellType;

    private String headerName;
    private String headerValue;


    private String methodBody;


    private String gadgetType;


    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public String getShellType() {
        return shellType;
    }

    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public String toolType;


    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getHeaderValue() {
        return headerValue;
    }

    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }



    public String getGadgetType() {
        return gadgetType;
    }

    public void setGadgetType(String gadgetType) {
        this.gadgetType = gadgetType;
    }


    public Map getMessage() {
        return result;
    }

    public void setMessage(Map message) {
        this.result = message;
    }

    private Map result = new HashMap();


    public String getExprEncoder() {
        return exprEncoder;
    }

    public void setExprEncoder(String exprEncoder) {
        this.exprEncoder = exprEncoder;
    }

    private String exprEncoder;

    public String getExtenderSimpleClassName() {
        return extenderSimpleClassName;
    }


    private String extenderSimpleClassName;

    public String getLoaderClassName() {
        return loaderClassName;
    }

    public void setLoaderClassName(String loaderClassName) {
        this.loaderClassName = loaderClassName;
    }

    public String loaderClassName;

    private String classFilePath;

    public String getClassFilePath() {
        return classFilePath;
    }

    public void setClassFilePath(String classFilePath) {
        this.classFilePath = classFilePath;
    }


}
