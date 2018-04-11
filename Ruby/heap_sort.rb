def heap_sort(fin)  
  n = fin.length 
  fin = [nil] + fin
  (n / 2).downto(1) do |i|  
    down_heap(fin, i, n)
  end

  while n > 1  
    fin[1], fin[n] = fin[n], fin[1]  
    n -= 1  
    down_heap(fin, 1, n)  
  end  
  fin.drop(1)
end

def down_heap(fin, parent, limit)  
  root = fin[parent]  
  while (child = 2 * parent) <= limit  
    child += 1  if child < limit && fin[child] < fin[child + 1]  
    break  if root >= fin[child]
    fin[parent] = fin[child]  
    parent = child  
  end  
  fin[parent] = root
end
