# Write your MySQL query statement below
# SELECT s.student_id, s.student_name, sub.subject_name, COALESCE(e.attended_exams, 0) AS attended_exams
# FROM Students s
# CROSS JOIN Subjects sub
# LEFT JOIN (
#     SELECT student_id, subject_name, COUNT(*) AS attended_exams
#     FROM Examinations
#     GROUP BY student_id, subject_name
# ) e USING (student_id, subject_name)
# ORDER BY s.student_id, sub.subject_name;


SELECT S.student_id, S.student_name, SUB.subject_name, 

count(E.subject_name) AS attended_exams FROM Students S CROSS JOIN 

Subjects SUB LEFT OUTER JOIN Examinations E ON 

S.student_id = E.student_id AND SUB.subject_name = E.subject_name  

GROUP BY S.student_id, S.student_name,SUB.subject_name ORDER BY 

S.student_id, SUB.subject_name