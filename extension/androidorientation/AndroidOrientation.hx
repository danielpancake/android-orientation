package extension.androidorientation;

import lime.system.JNI;

class AndroidOrientation {
    public static final UNSPECIFIED:Int = 0;
    public static final PORTRAIT:Int = 1;
    public static final REVERSE_PORTRAIT:Int = 2;
    public static final SENSOR_PORTRAIT:Int = 3;
    public static final LANDSCAPE:Int = 4;
    public static final REVERSE_LANDSCAPE:Int = 5;
    public static final SENSOR_LANDSCAPE:Int = 6;

	#if android
	// https://docs.oracle.com/javase/7/docs/technotes/guides/jni/spec/types.html
	private static final setRequestedOrientation = JNI.createStaticMethod("org.haxe.extension.androidorientation.AndroidOrientation",
		"setRequestedOrientation", "(I)V");
	#end

	public static function setScreenOrientation(screenOrientation:Int):Void {
		#if android
		setRequestedOrientation(screenOrientation);
		#end
	}
}
