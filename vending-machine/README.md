# Vending Machine

음료 자판기에 탑재될 거스름돈 반환 프로그램
- 조건
    1) 투입된 금액이 없는 경우 0원을 출력한다.
    2) 우리나라 화폐 권종(금액단위)에 맞는 금액만 투입이 가능 하다.
    3) 동전  지폐 투입이 가능 하다.
    4) 최소 개수의 동전으로 잔돈을 출력한다. <br>
        예) 1000원 넣고 650원짜리 음료를 선택했다면, 잔돈은 100, 100, 100, 50원으로 반환 한다.
    5) 지폐를 잔돈으로 반환하는 경우는 없다고 가정한다. <br>
    6) 투입한 금액이 표시 된다. 즉, 현재 잔액을 알 수 있다. 
    7) 투입 금액 표시화면에는 선택한 음료 가격만큼 제외된 가격이 표시 된다.
    8) 만일 표시된 남은 금액이 다른 음료를 선택할 수 있는 금액 이하이면 바로 잔돈으로 반환한다.
    9) 다른 음료를 선택할 수 있는 금액이 남아 있다면 최초 동전을 넣었을 때와 동일하게 동작한다.
    10) 표시되어 있는 금액을 잔돈으로 반환 한다.
    
    
    
스스로 구현 한다. <br>
요구사항 출처 : [테스트 주도개발 Book, chapter 10](https://m.search.naver.com/search.naver?query=%EA%B3%A0%ED%92%88%EC%A7%88+%EC%BE%8C%EC%86%8D%EA%B0%9C%EB%B0%9C%EC%9D%84+%EC%9C%84%ED%95%9C+tdd+%EC%8B%A4%EC%B2%9C%EB%B2%95%EA%B3%BC+%EB%8F%84%EA%B5%AC&sm=mtb_sug.top&where=m&oquery=%EB%AF%B8%EC%84%B8%EB%A8%BC%EC%A7%80&tqi=T03JBwpySDsssZRzbelssssssoo-154720&qdt=0&acq=tdd+%EC%8B%A4%EC%B2%9C%E3%85%82&acr=1#api=%3F_lp_type%3Dcm%26col_prs%3Dcsa%26format%3Dtext%26nqx_theme%3D%257B%2B%2522theme%2522%253A%257B%2522main%2522%253A%257B%2522name%2522%253A%2522book_info%2522%252C%2522os%2522%253A6291557%252C%2522pkid%2522%253A20000%257D%257D%2B%257D%26query%3D%25EA%25B3%25A0%25ED%2592%2588%25EC%25A7%2588%2B%25EC%25BE%258C%25EC%2586%258D%25EA%25B0%259C%25EB%25B0%259C%25EC%259D%2584%2B%25EC%259C%2584%25ED%2595%259C%2Btdd%2B%25EC%258B%25A4%25EC%25B2%259C%25EB%25B2%2595%25EA%25B3%25BC%2B%25EB%258F%2584%25EA%25B5%25AC%26sm%3Digr_brg%26tab%3Dinfo%26tab_prs%3Dcsa%26where%3Dbridge&_lp_type=cm)
 
