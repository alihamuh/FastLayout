# fastLayout
A library for putting views in rows and columns

[ ![Download](https://api.bintray.com/packages/alihamuh/AndroidRepo/fastTableLayout/images/download.svg?version=1.1.0) ](https://bintray.com/alihamuh/AndroidRepo/fastTableLayout/1.1.0/link)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg) ](https://opensource.org/licenses/mit-license.php)

With this library you can put your desired views in tabular form with just a few lines of code.

<img src="fastLayout_1.png" width="250"><img src="fastlayout_2.png" width="250">

<h3>Usage</h3>

<h4>Step 1</h4>

In you layout.xml put the fastlayout View with attributes:

    <com.alihamuh.fastTableLayout.FastLayout
        android:id="@+id/rows"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:square_size="9"
        app:cell_view="@layout/cell_view">

    </com.alihamuh.fastTableLayout.FastLayout>
	
You can use square_size for equal no of rows and columns or you can use no_of_columns and no_of_rows 
for un equal no of rows and columns.

You can define cell_view which can be your custom view for every cell here or in java. 

<h4>Step 2</h4>

     FastLayout view= findViewById(R.id.rows);


        ArrayList<FastAttributes> attributes=new ArrayList<>();
        for(int index=0;index<81;index++){
            FastAttributes attr=new FastAttributes();

            attr.setButtonText(Integer.toString(index));   //text attribute of your view

            View.OnClickListener onClickListener= new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   ////your code////////
                }
            };

            attr.setOnClickListener(onClickListener);

            attributes.add(attr);
        }

        view.setFastAttributesList(attributes);     

You can access fastLayout in java and set its rows and columns. 

If you want to change attribues of all the cells like color, test, onClick etc you can do so in a for loop equal to your square size i.e 
rowxcol. The attributes are enterred in the list in a linear manner i.e row by row. 

<h3>Setup:</h3>

<h4>Gradle:</h4>

Enter this in your build.gradle file:

	implementation 'com.alihamuh.fastTableLayout:fastTableLayout:<latest-version>'

and use the library.

**Note: `<latest-version>` value can be found on the JitPack badge above the preview images.**


First Header | Second Header
------------ | -------------
Content from cell 1 | Content from cell 2
Content in the first column | Content in the second column


## Contributing

Found a bug? feel free to fix it and send a pull request or [open an issue](https://github.com/alihamuh/fastLayout/issues).

