# QuickSort - BCUR 2018

def quick_sort(fin)
  return [] if fin.empty?
 
  numbers = fin.sample
  lesser, greater = fin.partition { |n| n < numbers }
  greater.delete_at(greater.index(numbers))
 
  [quick_sort(lesser), numbers, quick_sort(greater)].flatten

end
