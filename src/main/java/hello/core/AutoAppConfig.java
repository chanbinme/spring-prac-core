package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/* 스프링 설정 정보 */
@Configuration
/* Component애너테이션이 붙은 클래스를 스캔해서 설정 정보가 없어도 스프링 빈으로 등록한다. */
@ComponentScan(
        /**
         * ComponentScan할 목록에서 제외할 타입 설정
         * Configuration은 Component를 포함하고 있기 때문에 따로 제외시켜줌
         * */
        excludeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes
                = Configuration.class)
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
