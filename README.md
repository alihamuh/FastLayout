# fastLayout
A library for putting views in rows and columns

Enter this in your build.gradle file:

	implementation 'com.alihamuh.fastTableLayout:fastTableLayout:1.0.0'

and use the library.

<h3>Using jitpack:<h3>

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2. Add the dependency


	dependencies {
	        implementation 'com.github.alihamuh:fastLayout:2ec06db52e'
	}
	
	
First Header | Second Header
------------ | -------------
Content from cell 1 | Content from cell 2
Content in the first column | Content in the second column
