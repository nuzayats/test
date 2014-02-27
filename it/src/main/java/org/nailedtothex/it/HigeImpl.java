package org.nailedtothex.it;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(Hige.class)
public class HigeImpl implements Hige {

	@Override
	public int doHige(int x, int y) {
		return x * y;
	}

}
