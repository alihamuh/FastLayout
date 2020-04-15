# fastLayout
A library for putting views in rows and columns

<h3>How to use:</h3>

<h4>Using bintray:</h4>

Enter this in your build.gradle file:

	implementation 'com.alihamuh.fastTableLayout:fastTableLayout:1.0.0'

and use the library.

<h4>Using jitpack:</h4>

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
