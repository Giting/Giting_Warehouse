/**
 * @author <font color="red" size="5">fuchenggang</font>
 * @constructor passSpace
 * @description 去除空格
 * @param val 需去除空格的字符串
 * return 去除空格后的字符串
 * */
function passSpace(val) {
    var reVal = val.replace(/[ ]/g, "");
    return reVal;
}