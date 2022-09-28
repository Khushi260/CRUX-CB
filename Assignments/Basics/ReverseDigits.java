// https://hack.codingblocks.com/app/contests/3567/100/problem


Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

        int digit;
        int ans = 0;

        while( num>0){
              
              digit = num%10;

              ans = ans*10 + digit;
              num=num/10;
              
        }

        System.out.println(ans);
    }
}
