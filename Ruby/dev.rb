require_relative "quick_sort.rb"
require_relative "insertion_sort.rb"
require_relative "selection_sort.rb"
require_relative "merge_sort.rb"
require_relative "heap_sort.rb"

def test_sorting(fin, tc)
  fin.sort!
  incorrect = FALSE
  fin.each_with_index do |v, ind|
    incorrect = tc[ind] == v
    break unless incorrect
  end
  p "Sorting is correct" if incorrect
  p "Sorting is incorrect" unless incorrect  
end


fin = [3, 21, 113, 109, 64, 84, 112, 85, 102, 31, 0, 49, 32, 69, 96, 14, 106, 79, 56, 9]

tc = fin.dup
# tc = quick_sort(tc)
# tc = insertion_sort(tc)
# tc = selection_sort(tc)
# tc = merge_sort(tc)
# tc = heap_sort(tc)

# Testing
test_sorting(fin, tc)
