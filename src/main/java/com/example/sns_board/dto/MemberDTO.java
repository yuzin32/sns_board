package com.example.sns_board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor//기본생성자 만들어줌
@ToString
@Setter
@Getter
public class MemberDTO {
    //회원가입에 필요한내용들을 필드정의
    private Long id;
    private String memberEmail;
    private String memberId;
    private String memberPassword;
    private String memberNickname;


}
