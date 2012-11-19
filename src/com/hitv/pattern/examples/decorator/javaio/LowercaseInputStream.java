package com.hitv.pattern.examples.decorator.javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 扩展JAVA I/O机制装饰者类<br/>
 * 将InputStream所读到的内容转换为lower case
 * */
public class LowercaseInputStream extends FilterInputStream {

	@Override
	public int read() throws IOException {
		int readed = super.read();
		return readed == -1 ? readed : Character.toLowerCase((char) readed);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);

		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) Character.toLowerCase((char) (b[i]));
		}
		return result;
	}

	protected LowercaseInputStream(InputStream in) {
		super(in);
	}

}
