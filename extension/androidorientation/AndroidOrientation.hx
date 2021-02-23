package extension.androidorientation;

import lime.system.JNI;

class AndroidOrientation {
    public static final ORIENTATION_UNSPECIFIED:Int = 0;
    public static final ORIENTATION_PORTRAIT:Int = 1;
    public static final ORIENTATION_LANDSCAPE:Int = 2;

    #if android
    // https://docs.oracle.com/javase/7/docs/technotes/guides/jni/spec/types.html
    private static final setRequestedOrientation = JNI.createStaticMethod("org.haxe.extension.androidorientation.AndroidOrientation", "setRequestedOrientation", "(I)V");
    #end

    public static  function setScreenOrientation(screenOrientation:Int):Void {
        #if android
        setRequestedOrientation(screenOrientation);
        #end
    }
}