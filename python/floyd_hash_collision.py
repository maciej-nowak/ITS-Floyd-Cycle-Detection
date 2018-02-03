import hashlib

def hash(plain):
	temp = hashlib.md5(plain).hexdigest()
	bytes = []
	temp = ''.join( temp.split(" "))
	for i in range(0, len(temp), 2):
		bytes.append( chr( int (temp[i:i+2], 16 ) ) )
	first_hash = ''.join( bytes )
	return hashlib.md5(first_hash).hexdigest()[:14]


def floyd(hash, x0):
	tortoise = hash(x0)
	hare = hash(hash(x0))

	counter = 0
	final = ""
	print 'first while'

	while (tortoise != hare):
		tortoise = hash(tortoise)
		hare = hash(hash(hare))
		
		counter += 1
		if(counter % 10000000 == 0):
			print counter

	tortoise = x0

	print 'second while'
	counter = 0

	while (tortoise != hare):
		tortoise = hash(tortoise)
		hare = hash(hare)

		counter += 1
		if(counter % 10000000 == 0):
			print counter

		if (tortoise != hare):
			temp_tortoise = tortoise
			temp_hare = hare
			pass

		if (hash(tortoise) == hash(hare)):
			print "found hashes"
			print "tortoise", temp_tortoise
			print "hare", temp_hare
			final = 'tortoise: ' + temp_tortoise + "\n" + "hare: " + temp_hare
			with open('hashes.log', 'w') as file_:
				file_.write(final)
			break

	print 'checking calculations...'
	print "tortoise", temp_tortoise, ">", hash(temp_tortoise)
	print "hare", temp_hare, ">", hash(temp_hare)

floyd(hash, "maciejek")
