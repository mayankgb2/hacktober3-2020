# https://l.facebook.com/l.php?u=https%3A%2F%2Fyoutu.be%2Fx084tfX4JnI&h=AT22KCVnejxessxCjavH6Cw1glhBb8VND5gbGJgm2ADUpJ7a4ZO70FXbeV-b_fuHeJulYq0xkHMYIcujXeDhRgtg5MC9YnGvNq4ZUDmbtqnuzLV6uCuo7Vek1AqZe5IQ4Tmh&s=1
# Subscribed by : Naveen Yadav
# Python program for implementation of Selection 
# Sort 
import sys 
A = [64, 25, 12, 22, 11] 

# Traverse through all array elements 
for i in range(len(A)): 
	
	# Find the minimum element in remaining 
	# unsorted array 
	min_idx = i 
	for j in range(i+1, len(A)): 
		if A[min_idx] > A[j]: 
			min_idx = j 
			
	# Swap the found minimum element with 
	# the first element		 
	A[i], A[min_idx] = A[min_idx], A[i] 

# Driver code to test above 
print ("Sorted array") 
for i in range(len(A)): 
	print("%d" %A[i]), 
