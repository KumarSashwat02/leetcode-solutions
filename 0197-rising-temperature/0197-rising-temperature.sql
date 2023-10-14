# Write your MySQL query statement below
select w1.Id 
from weather w1
Inner Join weather w2
on w1.recordDate = Date_Add(w2.recordDate, Interval 1 Day)
Where w1.temperature > w2.temperature