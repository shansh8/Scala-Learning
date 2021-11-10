val data = sc.textFile("state-spec-income.txt");
val srdd = data.map(line => {var temp = line.split("\\s+"); var tot = temp(1).toInt * temp(2).toInt; (temp(0), (tot, temp(2).toInt))})
val out = srdd.reduceByKey((a,b) => (a._1+b._1, a._2+b._2))
val fout out.map(a => (a._1, a._2._1/a._2._2))
