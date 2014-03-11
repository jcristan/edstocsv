package com.fusesource.byexample.filebatchsplitter;

public class TestRegex {
	public static void main(String []args)
	{
		String body ="UNHUNHUNH,1,IFLIRRU,07N,1,1A,FDR,TA,314,100215,FDD,,INT,REF,STX,INA,LTS,IFD,,,R,USD,,Y,LTS,APD,,,,,,,,MGA,SAL,DAT,708,100215,0638,707,100215,0733,STX,INA,EQP,J,E90,TA,EQI,,,,,,,,,,90A,EQD,,,,,,A01,LEG,A01,NXC,EQI,C,8,S,C,8,A,CBL,0,0,0,,,,0,8,,0,Z,,0,EQN,100,COF,CBA,0,0,8,8,0,0,BUC,140,,,,,1,,,,8,BUC,175,,,,,2,,,,7,BUC,213,,,,,3,,,,6,BUC,267,,,,,4,,,,5,BUC,340,,,,,5,,,,4,BUC,417,,,,,6,,,,3,BUC,482,,,,,7,,,,2,BUC,574,,,,,8,,,,1,EQI,Y,88,S,Y,93,A,CBL,0,0,0,,,,0,93,,0,Z,,0,EQN,100,COF,CBA,0,0,88,93,0,0,BUC,90,,,,,1,,,,93,BUC,93,,,,,2,,,,92,BUC,96,,,,,3,,,,91,BUC,100,,,,,4,,,,90,BUC,103,,,,,5,,,,89,BUC,106,,,,,6,,,,88,BUC,108,,,,,7,,,,87,BUC,111,,,,,8,,,,86,BUC,114,,,,,9,,,,85,BUC,116,,,,,10,,,,84,BUC,119,,,,,11,,,,83,BUC,121,,,,,12,,,,82,BUC,123,,,,,13,,,,81,BUC,125,,,,,14,,,,80,BUC,127,,,,,15,,,,79,BUC,129,,,,,16,,,,78,BUC,131,,,,,17,,,,77,BUC,133,,,,,18,,,,76,BUC,135,,,,,19,,,,75,BUC,137,,,,,20,,,,74,BUC,139,,,,,21,,,,73,BUC,141,,,,,22,,,,72,BUC,143,,,,,23,,,,71,BUC,145,,,,,24,,,,70,BUC,147,,,,,25,,,,69,BUC,149,,,,,26,,,,68,BUC,151,,,,,27,,,,67,BUC,153,,,,,28,,,,66,BUC,155,,,,,29,,,,65,BUC,157,,,,,30,,,,64,BUC,159,,,,,31,,,,63,BUC,161,,,,,32,,,,62,BUC,163,,,,,33,,,,61,BUC,165,,,,,34,,,,60,BUC,167,,,,,35,,,,59,BUC,169,,,,,36,,,,58,BUC,172,,,,,37,,,,57,BUC,174,,,,,38,,,,56,BUC,176,,,,,39,,,,55,BUC,178,,,,,40,,,,54,BUC,180,,,,,41,,,,53,BUC,183,,,,,42,,,,52,BUC,185,,,,,43,,,,51,BUC,187,,,,,44,,,,50,BUC,189,,,,,45,,,,49,BUC,191,,,,,46,,,,48,BUC,192,,,,,47,,,,47,BUC,195,,,,,48,,,,46,BUC,197,,,,,49,,,,45,BUC,199,,,,,50,,,,44,BUC,202,,,,,51,,,,43,BUC,204,,,,,52,,,,42,BUC,207,,,,,53,,,,41,BUC,210,,,,,54,,,,40,BUC,213,,,,,55,,,,39,BUC,217,,,,,56,,,,38,BUC,220,,,,,57,,,,37,BUC,224,,,,,58,,,,36,BUC,228,,,,,59,,,,35,BUC,233,,,,,60,,,,34,BUC,236,,,,,61,,,,33,BUC,240,,,,,62,,,,32,BUC,244,,,,,63,,,,31,BUC,247,,,,,64,,,,30,BUC,251,,,,,65,,,,29,BUC,255,,,,,66,,,,28,BUC,258,,,,,67,,,,27,BUC,262,,,,,68,,,,26,BUC,267,,,,,69,,,,25,BUC,271,,,,,70,,,,24,BUC,275,,,,,71,,,,23,BUC,279,,,,,72,,,,22,BUC,283,,,,,73,,,,21,BUC,288,,,,,74,,,,20,BUC,294,,,,,75,,,,19,BUC,300,,,,,76,,,,18,BUC,306,,,,,77,,,,17,BUC,314,,,,,78,,,,16,BUC,323,,,,,79,,,,15,BUC,333,,,,,80,,,,14,BUC,344,,,,,81,,,,13,BUC,356,,,,,82,,,,12,BUC,369,,,,,83,,,,11,BUC,383,,,,,84,,,,10,BUC,396,,,,,85,,,,9,BUC,410,,,,,86,,,,8,BUC,423,,,,,87,,,,7,BUC,438,,,,,88,,,,6,BUC,449,,,,,89,,,,5,BUC,466,,,,,90,,,,4,BUC,491,,,,,91,,,,3,BUC,532,,,,,92,,,,2,BUC,589,,,,,93,,,,1,ODI,MGA,SAL,DAT,708,100215,0638,707,100215,0733,CAR,,D,AV,6651,,FF,STX,MAN,0,CLS,0,SCI,C,,0,0,0,0,0,TBU,,,,0,PDI,,C,CLA,LA,SBI,0,SBC,0,,,,GR,,,,8,,,,,,,4,,,2,100,0,0,0,0,0,0,0,L6,8,6,6,ATC,,SLC,Y,SLS,Y,PDI,,J,CLA,LA,SBI,0,SBC,0,,,,GR,,,,4,,,,,,C0,2,,,4,100,0,0,0,0,0,0,0,L4,4,4,4,ATC,,SLC,Y,SLS,Y,PDI,,D,CLA,LA,SBI,0,SBC,0,,,,GR,,,,2,,,,,,J0,2,,,8,100,0,0,0,0,0,0,0,L2,2,2,2,ATC,,SLC,Y,SLS,Y,PDI,,I,CLA,LA,SBI,0,SBC,0,,,,GR,RED,,,,0,,,,,,D0,0,,,2,100,0,0,0,0,0,0,0,LC,0,0,0,ATC,,SLC,Y,SLS,Y,PDI,,R,CLA,LA,SBI,0,SBC,0,,,,GR,STA,,,,0,,,,,,I0,0,,,50,100,0,0,0,0,0,0,0,LC,0,0,0,ATC,,SLC,Y,SLS,Y,SCI,Y,,0,0,0,0,0,TBU,,,,0,PDI,,Y,CLA,LA,SBI,0,SBC,0,,,,GR,,,,93,,,,,,,47,,,9,106,0,0,0,0,0,0,0,,93,49,49,ATC,,SLC,Y,SLS,Y,PDI,,B,CLA,LA,SBI,0,SBC,0,,,,GR,,,,46,,,,,,Y0,2,,,5,106,0,0,0,0,0,0,0,,46,46,47,ATC,,SLC,Y,SLS,Y,PDI,,M,CLA,LA,SBI,0,SBC,0,,,,GR,,,,44,,,,,,B0,1,,,10,106,0,0,0,0,0,0,0,,44,44,44,ATC,,SLC,Y,SLS,Y,PDI,,H,CLA,LA,SBI,0,SBC,0,,,,GR,,,,43,,,,,,M0,7,,,7,106,0,0,0,0,0,0,0,,43,43,43,ATC,,SLC,Y,SLS,Y,PDI,,Q,CLA,LA,SBI,0,SBC,0,,,,GR,,,,36,,,,,,H0,2,,,5,106,0,0,0,0,0,0,0,,36,36,37,ATC,,SLC,Y,SLS,Y,PDI,,V,CLA,LA,SBI,0,SBC,0,,,,GR,,,,34,,,,,,Q0,2,,,10,106,0,0,0,0,0,0,0,,34,34,34,ATC,,SLC,Y,SLS,Y,PDI,,A,CLA,LA,SBI,0,SBC,0,,,,GR,,,,32,,,,,,V0,5,,,10,106,0,0,0,0,0,0,0,,32,32,32,ATC,,SLC,Y,SLS,Y,PDI,,E,CLA,LA,SBI,0,SBC,0,,,,GR,,,,27,,,,,,A0,2,,,10,106,0,0,0,0,0,0,0,,27,27,27,ATC,,SLC,Y,SLS,Y,PDI,,G,CLA,LA,SBI,0,EQN,0,SLM,SBC,0,,,,GR,,,,25,,,,,,E0,1,,,9,106,0,0,0,0,0,0,0,LC,25,0,25,ATC,,SLC,Y,SLS,Y,PDI,,K,CLA,LA,SBI,0,SBC,0,,,,GR,,,,24,,,,,,G0,9,,,8,106,0,0,0,0,0,0,0,,24,24,24,ATC,,SLC,Y,SLS,Y,PDI,,L,CLA,LA,SBI,0,SBC,0,,,,GR,,,,15,,,,,,K0,4,,,10,106,0,0,0,0,0,0,0,,15,15,16,ATC,,SLC,Y,SLS,Y,PDI,,O,CLA,LA,SBI,0,SBC,0,,,,GR,,,,11,,,,,,L0,6,,,5,106,0,0,0,0,0,0,0,,11,11,11,ATC,,SLC,Y,SLS,Y,PDI,,P,CLA,LA,SBI,0,SBC,0,,,,GR,,,,5,,,,,,O0,2,,,10,106,0,0,0,0,0,0,0,L5,5,5,5,ATC,,SLC,Y,SLS,Y,PDI,,Z,CLA,LA,SBI,0,SBC,0,,,,GR,,,,3,,,,,,P0,2,,,6,106,0,0,0,0,0,0,0,L3,3,3,3,ATC,,SLC,Y,SLS,Y,PDI,,W,CLA,LA,SBI,0,SBC,0,,,,GR,,,,1,,,,,,Z0,1,,,7,106,0,0,0,0,0,0,0,L1,1,1,1,ATC,,SLC,Y,SLS,Y,PDI,,S,CLA,LA,SBI,0,SBC,0,,,,GR,,,,0,,,,,,W0,0,,,5,106,0,0,0,0,0,0,0,LC,0,0,0,ATC,,SLC,Y,SLS,Y,PDI,,T,CLA,LA,SBI,0,SBC,0,,,,GR,,,,0,,,,,,S0,0,,,5,106,0,0,0,0,0,0,0,LC,0,0,0,ATC,,SLC,Y,SLS,Y,PDI,,U,CLA,LA,SBI,0,SBC,0,,,,GR,,,,0,,,,,,T0,0,,,7,106,0,0,0,0,0,0,0,LC,0,0,0,ATC,,SLC,Y,SLS,Y,PDI,,X,CLA,LA,SBI,0,SBC,0,,,,GR,RED,,,,0,,,,,,U0,0,,,5,106,0,0,0,0,0,0,0,LC,0,0,0,ATC,,SLC,Y,SLS,Y,PDI,,N,CLA,LA,SBI,0,SBC,0,,,,GR,STA,,,,0,,,,,,X0,0,,,10,106,0,0,0,0,0,0,0,LC,0,0,0,ATC,,SLC,Y,SLS,Y,STX,OR,0,DAT,,100314,0155,,0039,UNT";
		System.out.println(body);
		/*body = body.replaceAll("[^\\p{L}\\p{Nd}]", ",")
				.replaceAll(",UNT,", "\r\n")
				.replaceAll(",UNT", "\r\n")
				.replaceAll("UNH+", "")				
				.substring(1);
			*/
		
		body = body.replaceAll("[^\\p{L}\\p{Nd}]", ",")
				.replaceAll("(,UNT,", "\r\n")
				.replaceAll(",UNT", "\r\n")
				.replaceAll("UNH+", "")				
				.substring(1);
		
		System.out.println(body);
	}
}
