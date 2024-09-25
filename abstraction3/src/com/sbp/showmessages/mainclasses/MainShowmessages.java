package com.sbp.showmessages.mainclasses;

import com.sbp.showmessages.interfaces.Showmessages;

public class MainShowmessages {
public static void main(String[] args) {
	Showmessages message = ()->{ System.out.println("hello");
	System.out.println("hii");
	};
	message.displaymessage();
}

}
