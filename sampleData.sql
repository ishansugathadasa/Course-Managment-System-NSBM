-----------------------------------------------------------------------------------------
INSERT INTO course VALUES('c0001', 'course1');
INSERT INTO course VALUES('c0002', 'course2');
INSERT INTO course VALUES('c0003', 'course3');
INSERT INTO course VALUES('c0004', 'course4');
INSERT INTO course VALUES('c0005', 'course5');

-----------------------------------------------------------------------------------------
INSERT INTO faculty VALUES('f0001', 'School of Business');
INSERT INTO faculty VALUES('f0002', 'School of Computing');
INSERT INTO faculty VALUES('f0003', 'School of Engineering');

-----------------------------------------------------------------------------------------
INSERT INTO instructor VALUES('i0001', 'kasun1', 'dinuka.kasunds@gmail.com', 'M', 0717275722, '1995-09-20', '1234');
INSERT INTO instructor VALUES('i0002', 'kasun2', 'dinuka.kasunds@gmail.com', 'M', 0717275722, '1995-09-20', '1234');
INSERT INTO instructor VALUES('i0003', 'kasun3', 'dinuka.kasunds@gmail.com', 'M', 0717275722, '1995-09-20', '1234');
INSERT INTO instructor VALUES('i0004', 'kasun4', 'dinuka.kasunds@gmail.com', 'M', 0717275722, '1995-09-20', '1234');
INSERT INTO instructor VALUES('i0005', 'kasun5', 'dinuka.kasunds@gmail.com', 'M', 0717275722, '1995-09-20', '1234');

----------------------------------------------------------------------------------------
INSERT INTO lab VALUES('lab0001', 'A', 'w0001');
INSERT INTO lab VALUES('lab0002', 'B', 'w0002');
INSERT INTO lab VALUES('lab0003', 'C', 'w0003');

-----------------------------------------------------------------------------------------
INSERT INTO lecturer VALUES('l0001', 'dinuka kasun1', 'dinuka.kasunds@gmail.com', 'M', '1995-09-20', '952641514v', '1234');
INSERT INTO lecturer VALUES('l0002', 'dinuka kasun2', 'dinuka.kasunds@gmail.com', 'M', '1995-09-20', '952641514v', '1234');
INSERT INTO lecturer VALUES('l0003', 'dinuka kasun3', 'dinuka.kasunds@gmail.com', 'M', '1995-09-20', '952641514v', '1234');
INSERT INTO lecturer VALUES('l0004', 'dinuka kasun4', 'dinuka.kasunds@gmail.com', 'M', '1995-09-20', '952641514v', '1234');
INSERT INTO lecturer VALUES('l0005', 'dinuka kasun4', 'dinuka.kasunds@gmail.com', 'M', '1995-09-20', '952641514v', '1234');

-----------------------------------------------------------------------------------------
INSERT INTO postgraduatestudent VALUES('po0001', '2018-05-30', 'dinuka kasun1', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'advanced_level', 2018, 'ABC', 'f0001', 'c0001', 'lab0001', 5);
INSERT INTO postgraduatestudent VALUES('po0002', '2018-05-30', 'dinuka kasun2', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'advanced_level', 2018, 'ABC', 'f0001', 'c0001', 'lab0001', 5);
INSERT INTO postgraduatestudent VALUES('po0003', '2018-05-30', 'dinuka kasun3', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'advanced_level', 2018, 'ABC', 'f0001', 'c0001', 'lab0001', 5);
INSERT INTO postgraduatestudent VALUES('po0004', '2018-05-30', 'dinuka kasun4', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'advanced_level', 2018, 'ABC', 'f0001', 'c0001', 'lab0001', 5);
INSERT INTO postgraduatestudent VALUES('po0005', '2018-05-30', 'dinuka kasun5', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'advanced_level', 2018, 'ABC', 'f0001', 'c0001', 'lab0001', 5);

-----------------------------------------------------------------------------------------
INSERT INTO subject VALUES('s0001', 'subject1', 'c0001', 'lab0001');
INSERT INTO subject VALUES('s0002', 'subject2', 'c0001', 'lab0001');
INSERT INTO subject VALUES('s0003', 'subject3', 'c0002', 'lab0002');
INSERT INTO subject VALUES('s0004', 'subject4', 'c0003', 'lab0001');
INSERT INTO subject VALUES('s0005', 'subject5', 'c0003', 'lab0002');

-----------------------------------------------------------------------------------------
INSERT INTO undergraduatestudent VALUES('un0001', '2018-05-30', 'dinuka kasun1', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'Math:A', 'Math:B', 'Math:C', 1, 'f0001', 'c0001', 'lab0001', 'No', 5);
INSERT INTO undergraduatestudent VALUES('un0002', '2018-05-30', 'dinuka kasun2', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'Math:A', 'Math:B', 'Math:C', 1, 'f0001', 'c0001', 'lab0001', 'No', 5);
INSERT INTO undergraduatestudent VALUES('un0003', '2018-05-30', 'dinuka kasun3', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'Math:A', 'Math:B', 'Math:C', 1, 'f0001', 'c0001', 'lab0001', 'No', 5);
INSERT INTO undergraduatestudent VALUES('un0004', '2018-05-30', 'dinuka kasun4', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'Math:A', 'Math:B', 'Math:C', 1, 'f0001', 'c0001', 'lab0001', 'No', 5);
INSERT INTO undergraduatestudent VALUES('un0005', '2018-05-30', 'dinuka kasun5', '952641514v', '1995-09-20', 'M', 'dinuka.kasunds@gmail.com', '73 Dampe,Madapatha', 0717275722, '1234', 'Math:A', 'Math:B', 'Math:C', 1, 'f0001', 'c0001', 'lab0001', 'No', 5);

-----------------------------------------------------------------------------------------

INSERT INTO admin VALUES('a0001', 'dinuka kasun1', '73 Dampe,Madapatha', 0717275722, 'dinuka.kasunds@gmail.com', '1234');
INSERT INTO admin VALUES('a0002', 'dinuka kasun2', '73 Dampe,Madapatha', 0717275722, 'dinuka.kasunds@gmail.com', '1234');
INSERT INTO admin VALUES('a0003', 'dinuka kasun3', '73 Dampe,Madapatha', 0717275722, 'dinuka.kasunds@gmail.com', '1234');
INSERT INTO admin VALUES('a0004', 'dinuka kasun4', '73 Dampe,Madapatha', 0717275722, 'dinuka.kasunds@gmail.com', '1234');
INSERT INTO admin VALUES('a0005', 'dinuka kasun5', '73 Dampe,Madapatha', 0717275722, 'dinuka.kasunds@gmail.com', '1234');

-----------------------------------------------------------------------------------------
INSERT INTO subjectinstructor VALUES('i0001', 's0001', 'w0002');
INSERT INTO subjectinstructor VALUES('i0001', 's0002', 'w0002');
INSERT INTO subjectinstructor VALUES('i0002', 's0001', 'w0001');
INSERT INTO subjectinstructor VALUES('i0003', 's0002', 'w0002');
INSERT INTO subjectinstructor VALUES('i0004', 's0003', 'w0002');

-----------------------------------------------------------------------------------------
INSERT INTO labinstructor VALUES('i0001', 'lab0001', 'startTime', 'endTime');
INSERT INTO labinstructor VALUES('i0001', 'lab0002', 'startTime', 'endTime');
INSERT INTO labinstructor VALUES('i0001', 'lab0003', 'startTime', 'endTime');
INSERT INTO labinstructor VALUES('i0002', 'lab0001', 'startTime', 'endTime');
INSERT INTO labinstructor VALUES('i0003', 'lab0001', 'startTime', 'endTime');

-----------------------------------------------------------------------------------------
INSERT INTO bscsubjec VALUES('s0001', 'un0001', 2000.00, '2018-05-30');
INSERT INTO bscsubjec VALUES('s0001', 'un0002', 2000.00, '2018-05-30');
INSERT INTO bscsubjec VALUES('s0003', 'un0001', 2000.00, '2018-05-30');
INSERT INTO bscsubjec VALUES('s0004', 'un0001', 2000.00, '2018-05-30');
INSERT INTO bscsubjec VALUES('s0003', 'un0003', 2000.00, '2018-05-30');

-----------------------------------------------------------------------------------------
INSERT INTO mscsubjec VALUES('s0001', 'po0001', 2000.00, '2018-05-30');
INSERT INTO mscsubjec VALUES('s0001', 'po0002', 2000.00, '2018-05-30');
INSERT INTO mscsubjec VALUES('s0001', 'po0004', 2000.00, '2018-05-30');
INSERT INTO mscsubjec VALUES('s0002', 'po0001', 2000.00, '2018-05-30');
INSERT INTO mscsubjec VALUES('s0004', 'po0002', 2000.00, '2018-05-30');

-----------------------------------------------------------------------------------------
INSERT INTO lecturersubjects VALUES('s0001', 'l0001', 'w0002');
INSERT INTO lecturersubjects VALUES('s0002', 'l0001', 'w0001');
INSERT INTO lecturersubjects VALUES('s0003', 'l0002', 'w0002');
INSERT INTO lecturersubjects VALUES('s0004', 'l0003', 'w0003');
INSERT INTO lecturersubjects VALUES('s0005', 'l0004', 'w0002');

-----------------------------------------------------------------------------------------
INSERT INTO exam VALUES('e0001', '2018-05-30');
INSERT INTO exam VALUES('e0002', '2018-05-30');
INSERT INTO exam VALUES('e0003', '2018-05-30');
INSERT INTO exam VALUES('e0004', '2018-05-30');
INSERT INTO exam VALUES('e0005', '2018-05-30');

---------------------------------------------------------------------------------------
INSERT INTO bscexam VALUES('e0001', 'un0001', 'A');
INSERT INTO bscexam VALUES('e0001', 'un0002', 'A');
INSERT INTO bscexam VALUES('e0002', 'un0003', 'A');
INSERT INTO bscexam VALUES('e0002', 'un0004', 'A');
INSERT INTO bscexam VALUES('e0003', 'un0005', 'A');

-----------------------------------------------------------------------------------------
INSERT INTO mscexam VALUES('po0001', 'e0001', 'A');
INSERT INTO mscexam VALUES('po0002', 'e0001', 'A');
INSERT INTO mscexam VALUES('po0003', 'e0002', 'A');
INSERT INTO mscexam VALUES('po0004', 'e0001', 'A');
INSERT INTO mscexam VALUES('po0005', 'e0003', 'A');

-----------------------------------------------------------------------------------------

