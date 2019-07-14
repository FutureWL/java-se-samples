package io.github.futurewl.common;

/**
 * 功能描述：
 *
 * @author weilai
 */
public class Const {
    /**
     * 5天(以毫秒ms计)
     */
    public static final long EXPIRATION_TIME = 432_000_000;

    /**
     * JWT密码
     */
    public static final String SECRET = "RGBSecret";

    /**
     * Token前缀
     */
    public static final String TOKEN_PREFIX = "Bearer";

    /**
     * 存放Token的Header Key
     */
    public static final String HEADER_STRING = "token";

    /**
     * 验证码code
     */
    public static final String IMAGE_CODE = "imagecode";

}
