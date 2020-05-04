package com.bank;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.index.IndexWriter;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.IOException;

public class Index_Demo {
    @Test
    public void  test() throws IOException {

        IKAnalyzer analyzer = new IKAnalyzer();
        TokenStream tokenStream = analyzer.tokenStream("test", "使用ik分词器将他妈的document写入交通银行开发一部");
        CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);
        tokenStream.reset();
        while (tokenStream.incrementToken()){
            System.out.println(charTermAttribute);
        }


    }
}
