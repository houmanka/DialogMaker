DialogMaker
===========

This is simple DialogMaker. It will help to keep the code clean when you are dealing with DialogBoxes

Usage:
<pre>
	<code>
HashMap<Keys, String> params = new HashMap<Keys, String>();
		params.put(Keys.BUTTON_1, "YES");
		params.put(Keys.BUTTON_2, "NO");
		params.put(Keys.MESSAGE, "This is a test");

		new DialogMaker(this, params, Type.STANDARD) {

			@Override
			protected void dealWithTheButton1() {
				Log.i(TAG,"Button 1 clicked");
			}

			@Override
			protected void dealWithTheButton2() {
				Log.i(TAG,"Button 2 clicked");
			}

		};
</code>
</pre>
Please use the sample. for more information. 
You are more than welcome to edit the class to fit your need.
This class is not supporting a custom Layout yet.

H.