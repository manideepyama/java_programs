[6789][0-9][0-9][0-9]
			[0-9][0-9][0-9]
			[0-9][0-9][0-9]
=================
            or   [6789]\d{9}  or [6-9][0-9]{9}
==================
[6789][0-9]+   //invalid
[6789][0-9]*   //invalid

==================
Case 2:
[6789][0-9]{9} --> 10 digit
0[6789][0-9]{9}  --> 11 digit

0?[6789][0-9]{9}

==========================
Case 3:
[6789][0-9]{9} --> 10 digit
0[6789][0-9]{9}  --> 11 digit
0?[6789][0-9]{9}
(91|0)?[6789][0-9]{9}
==================================
1----------------2-------------- @ ------3--------
s hashikumar.chukkala @ gmail.com
[a-zA-Z0-9][a-zA-Z0-9._]@gmail[.]com

Any Mail_id
1----------------2-------------- @ ------3--------
s hashikumar.chukkala @ gmail.com
                                                 hotmail.com
												 yahoo.com
												 tv9.com
												 v6.com
[a-zA-Z0-9][a-zA-Z0-9._]@[a-zA-Z0-9]+[.]com

1----------------2-------------- @ ------3--------
s hashikumar.chukkala @ gmail.com
                                                 hotmail.com
												 yahoo.net
												 tv9.edu
												 v6.ap
[a-zA-Z0-9][a-zA-Z0-9._]@[a-zA-Z0-9]+[.][a-z]+


1----------------2-------------- @ ------3--------
s hashikumar.chukkala @ gmail.com
                                                 hotmail.com
												 yahoo.net
												 tv9.edu.uk
												 ts.gov.in
[a-zA-Z0-9][a-zA-Z0-9._]@
                                              [a-zA-Z0-9]+
											  [[.][a-z]+]+





















