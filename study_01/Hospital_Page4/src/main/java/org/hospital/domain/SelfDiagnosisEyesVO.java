package org.hospital.domain;


import lombok.Data;
/*
 *create table Self_diagnosis_eyes (
    bno number(10, 0) primary key,          -- 번호       // primary key
  question varchar2(300) not null       -- 문항
); 
 */
@Data
public class SelfDiagnosisEyesVO {
private String question;
private Long bno;
}
