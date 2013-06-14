DialogMaker
===========

This is simple DialogMaker. It will help to keep the code clean when you are dealing with DialogBoxes

Usage:

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
		
