def insertion_sort(fin)
  size = fin.length
  i = 0
  while i < size
    current = fin[i]
    j = i
    while j > 0 && fin[j - 1] > current
      fin[j] = fin[j - 1]
      j -= 1
    end
    fin[j] = current
    i += 1
  end
  return fin
end
