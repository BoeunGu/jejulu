package hello.jejulu.service.member;

import hello.jejulu.web.dto.MemberDto;

public interface MemberService {
    MemberDto.Save add(MemberDto.Save memberSaveDto);

}
