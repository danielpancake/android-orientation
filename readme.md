# android-orientation
Haxe extension which allows you to set screen orientation on android

## Installation
```bash
haxelib git android-orientation https://github.com/danielpancake/android-orientation.git
```

Precompiled libraries are included, but it is recommended you compile them yourself:
```bash
lime rebuild android-orientation android
```

## Usage
- Project.xml:
```xml
<!-- Add this line in the libraries section of your Project.xml file -->
<haxelib name="android-orientation" />
```

- In any haxe package of your project:
```haxe
import extension.androidorientation.AndroidOrientation;

...

AndroidOrientation.setScreenOrientation(AndroidOrientation.SENSOR_LANDSCAPE);
// or UNSPECIFIED, PORTRAIT, REVERSE_PORTRAIT, SENSOR_PORTRAIT, LANDSCAPE, REVERSE_LANDSCAPE
```
It is advised to call this function as early as possible (preferably in preloader) to avoid screen cropping.
