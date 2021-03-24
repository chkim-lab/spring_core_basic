package com.spring.core.basic.paper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    @Autowired
    private Paper paper;

//    @Autowired
    public Printer(Paper paper) {

//        this.paper = paper;
    }
/*    @Autowired
    public void setPaper(Paper paper) {
        this.paper = paper;
    }*/

    //용지 출력 기능
    public void printPaper() {
        System.out.println("======= 출력 내용 =======");
        for (String data: paper.datas) {
            System.out.println("# " + data);
        }
    }
}
