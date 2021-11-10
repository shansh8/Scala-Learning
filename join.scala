val dataT1 = sc.textFile(table1)
val t1Rdd = dataT1.map(line => {var col = line.split("\\s+"); (col(2), (col(0), col(1)))})
val dataT2 = sc.textFile(table2)
val t2Rdd = dataT2.map(line => {var col = line.split("\\s+"); (col(1), (col(0)))})
val out = t1Rdd.join(t2Rdd).take(5).foreach(println) // take first 5 records

